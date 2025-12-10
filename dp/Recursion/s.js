class ShoppingCart {
    constructor() {
        this.items = [];
        this.total = 0;
        this.discountApplied = false;
    }

    // Add item to cart
    // BUG 1
    addItem(name, price, quantity) {
        const existingItem = this.items.find(item => item.name === name);
        
        if (existingItem) {
            // If item exists, increase quantity
            existingItem.quantity += quantity;
        } else {
            // Otherwise, add new item
            this.items.push({
                name,
                price,
                quantity
            });
        }
        this.total += price;
    }

    // Apply percentage discount voucher
    // BUG 2:
    applyDiscount(discountPercent) {
        if (this.discountApplied) {
            return this.total;
        }

        this.discountApplied = true;

        const discount = discountPercent; 
        this.total -= discount;               // not converting into percentage just subtracting the discount amount

        if (this.total < 0) {
            this.total = 0;
        }

        return this.total;
    }

    // Remove item from cart
    // BUG 3
    removeItem(itemName) {
        for (let i = 0; i < this.items.length; i++) {
            if (this.items[i].name === itemName) {
                // BUG 3              // not updating the total
                this.items.splice(i, 1);
                break;
            }
        }
    }

    // Get most expensive item (by total cost)
    // BUG 4
    getMostExpensiveItem() {
        if (this.items.length === 0) {
            return null;
        }

        let maxCost = 0;
        let expensiveItem = null;

        for (let item of this.items) {
            if (item.price > maxCost) {
                maxCost = item.price;
                expensiveItem = item.name;
            }
        }

        return expensiveItem;
    }

    // Checkout: returns total, tax, payable
    // BUG 5
    checkout() {
        let rawTotal = 0;

        for (let item of this.items) {
            rawTotal += item.price;   // *quantity
        }

        const tax = rawTotal * 0.05;
        const payable = rawTotal + tax;

        return {
            total: rawTotal,
            tax: tax,
            payable: payable
        };
    }
}

// Example tests (these are supposed to FAIL with this buggy implementation)

let cart = new ShoppingCart();
cart.addItem("Laptop", 50000, 1);
cart.addItem("Mouse", 500, 2);
cart.addItem("Mouse", 500, 1);
console.log(cart.total); // Expected: 51500 (will be wrong with BUG 1)
cart.applyDiscount(10);
console.log(cart.total); // Expected: 46350 (will be wrong with BUG 2)
cart.removeItem("Mouse");
console.log(cart.total); // Expected: 45000 (will be wrong with BUG 3)
console.log(cart.getMostExpensiveItem()); // Expected: "Laptop" (might still pass here)
console.log(cart.checkout()); // Expected: { total: 45000, tax: 2250, payable: 47250 } (BUG 5)