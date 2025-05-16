# 🛒 E-Commerce Application

Object Oriented Programming - Homework Project  
**Manisa Celal Bayar University**  
Faculty of Engineering - Computer Engineering  
**2022-2023 Spring Semester**  

> **Student:** Furkan Bulut  
> **Student No:** 210316011  

---

## 📌 Project Overview

This project simulates a basic **e-commerce application** using Java and Object-Oriented Programming principles such as encapsulation, constructors, method overloading, and data hiding. The system models Users, Products, Orders, and Credit Cards, supporting stock tracking, ordering, and payment processing functionalities.

---

## 📂 Contents

- [UML Diagram](#-uml-diagram)
- [User Class](#-user-class)
- [Product Class](#-product-class)
- [Order Class](#-order-class)
- [CreditCard Class](#-creditcard-class)
- [Main/Test Class](#-maintest-class)

---

## 🗂 UML Diagram

> A UML class diagram is provided in the project folder that visualizes class relationships.

---

## 👤 User Class

The `User` class represents a customer in the system.

### ✅ Attributes:
- `fullName`, `email`, `password`, `phone`, `address`, `workAddress` (private `String`)
- `ArrayList<Product>` for favorite products and orders

### 🛠 Constructor:
Initializes user details.

### 🔧 Methods:
- `addProductToFavorites(Product product)`
- `removeProductFromFavorites(Product product)`
- `addProductToOrder(Product product)`
- `removeProductFromOrder(Product product)`
- Getters and Setters for all fields

---

## 📦 Product Class

The `Product` class defines the items available for purchase.

### ✅ Attributes:
- `productName`, `productDescription`, `productCategory`, `productBrand`, `productColor`, `productSize`, `productPrice`, `productStock` (private)

### 🛠 Constructor:
Initializes product details.

### 🔧 Methods:
- `boolean checkStock()`  
  Checks stock and returns `true` if available.
- `void reduceStock()`  
  Decreases the product's stock.
- `String toString()`  
  Returns a formatted product description.

---

## 🧾 Order Class

The `Order` class manages the shopping process and interactions.

### ✅ Attributes:
- `User user`
- `Product product`
- `CreditCard creditCard`

### 🛠 Constructor:
Assigns ordering entities.

### 🔧 Methods:
- `void addToOrder()`  
  Adds product to order if stock is available.
- `void processPayment()`  
  Checks balance, deducts payment, reduces stock.

---

## 💳 CreditCard Class

The `CreditCard` class models user payment information.

### ✅ Attributes:
- `cardNumber`, `expirationDate`, `securityCode`, `cardBalance`
- `User user`

### 🛠 Constructor:
Initializes the card and its user.

### 🔧 Methods:
- Getters and Setters for all private fields

---

## 🧪 Main/Test Class

Used to test and simulate the application flow.

### 🔁 Actions:
- Create two `User` instances
- Create two `CreditCard` instances
- Create two `Product` instances
- Test methods like adding to favorites, checking stock, placing an order, and processing payment

---

## 🖥 Sample Console Output

The test class demonstrates the functionality through printed messages including stock checks, successful or failed order messages, and balance updates.

---

## 📌 Note

All classes follow **OOP principles**:
- Encapsulation with `private` variables
- Use of **constructors** for initialization
- **ArrayList** is used to store collections of items
- **Getter and Setter** methods to access and modify data safely

---

## 📎 Author

**Furkan Bulut**  
> Computer Engineering Student  
> Manisa Celal Bayar University  

