# Shape Area Calculator – AWT

A Java AWT-based GUI application that calculates the area of different geometric shapes. The project provides a simple graphical interface where users can select a shape, enter the required dimensions, and calculate its area.

## ✨ Features

* GUI built using **Java AWT**
* Shape selection using `Choice`
* Separate calculation interface for each shape
* Input validation for:

  * Empty input fields
  * Alphabetic/string input
  * Zero or negative values
* Clear button to reset input fields
* Home button to return to the main menu
* Displays calculated area directly in the GUI
* Uses `ActionListener` for button events

## 📐 Supported Shapes

The calculator currently supports:

1. Circle
2. Square
3. Rectangle
4. Triangle
5. Parallelogram
6. Rhombus
7. Trapezium
8. Kite
9. Ellipse
10. Regular Hexagon

## 🧮 Formulas Used

| Shape           | Formula         |
| --------------- | --------------- |
| Circle          | πr²             |
| Square          | s²              |
| Rectangle       | l × b           |
| Triangle        | ½ × b × h       |
| Parallelogram   | b × h           |
| Rhombus         | b × h           |
| Trapezium       | ½ × (a + b) × h |
| Kite            | ½ × d₁ × d₂     |
| Ellipse         | π × a × b       |
| Regular Hexagon | (3√3 / 2) × s²  |

## 🛡️ Input Validation

The program checks user input before performing calculations.

### Empty Input

If a required field is left empty, an error message is displayed.

### String Input

Alphabetic input such as `abc` is detected and rejected.

### Zero or Negative Input

Dimensions must be greater than zero. Zero and negative values are rejected.

### Clear Function

The **Clear** button removes the entered values and previous error/output messages.

## 🖥️ GUI Structure

### Main Menu

The main menu contains:

* Shape selection dropdown
* Select button
* Selected shape display
* Calculate button

### Calculation Window

The calculation window contains:

* Shape-specific input fields
* Calculate button
* Clear button
* Area/output display
* Home button

## ⚙️ Technologies Used

* **Java**
* **AWT (Abstract Window Toolkit)**
* **Event Handling**
* `ActionListener`
* `Frame`
* `Label`
* `Button`
* `TextField`
* `Choice`

## ▶️ How to Run

### 1. Compile

```bash
javac ShapeAreaCalculator_AWT.java
```

### 2. Run

```bash
java ShapeAreaCalculator_AWT
```

## 📁 Project Structure

```text
ShapeAreaCalculator/
│
├── ShapeAreaCalculator_AWT.java
└── README.md
```

## 📌 Project Highlights

This project was developed to practice:

* Java GUI development
* AWT components
* Event-driven programming
* `switch` statements
* String handling
* Type conversion using `Double.parseDouble()`
* Conditional statements
* Input validation
* Working with multiple GUI components
* Organizing a multi-shape calculation program

## 🚀 Future Improvements

Possible improvements for future versions:

* Add the remaining input validation cases for non-alphabetic invalid characters
* Replace repeated code with reusable methods
* Improve GUI layout using layout managers
* Add more geometric shapes
* Add a more modern GUI using **Swing** or **JavaFX**
* Add proper window-closing functionality
* Improve mathematical precision by using `Math.PI`

## 👨‍💻 Author

**Anup Sure**

> Built as a Java AWT GUI project to practice event handling, GUI development, mathematical calculations, and input validation.
