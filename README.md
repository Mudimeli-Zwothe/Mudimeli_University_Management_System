## 📚 Mudimeli Student Management System (Java Console App)

This project is a simple Java console application, It simulates a basic student management system for allowing users to perform CRUD operations on student data.

### 🛠️ Features

* 📥 **Add new student** (with age validation)
* 🔍 **Search student by ID**
* ❌ **Delete student** (with confirmation)
* 📊 **View all student records**
* 🚪 **Exit application**

### 👨‍💻 Technologies

* Java (Core)
* Console I/O
* `ArrayList` for data storage
* Basic input validation

### 📁 File Structure

```
.
├── Main.java        // Entry point with user menu
└── Student.java     // Student class with all operations (save, search, delete, report)
```

### 🧪 How to Compile and Run

1. **Open Terminal** in the folder containing `Main.java` and `Student.java`.

2. **Compile both files**:

   ```bash
   javac Main.java Student.java
   ```

3. **Run the application**:

   ```bash
   java Main
   ```

> ⚠️ No external libraries or packages required. All data is stored in memory (not persistent).
