# KMP String Search Algorithm  
**Knuth-Morris-Pratt (KMP) — O(n + m) String Matching**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Algorithm](https://img.shields.io/badge/Algorithm-KMP-blue?style=for-the-badge)
![Complexity](https://img.shields.io/badge/Time-O(n%2Bm)-green?style=for-the-badge)
![Bonus](https://img.shields.io/badge/Bonus-%2B5%20to%20Endterm-success?style=for-the-badge)


## Algorithm Overview

The **Knuth-Morris-Pratt (KMP)** algorithm efficiently finds all occurrences of a pattern in a text by using a **prefix function (π)** to avoid unnecessary character comparisons.

### Key Idea:
> Instead of shifting the pattern by 1 when a mismatch occurs, **KMP shifts by the maximum safe amount** using precomputed prefix information.

---

## Features

| Feature                     | Status  |
|----------------------------|---------|
| Full KMP Implementation     | Done    |
| Prefix Function (π)         | Done    |
| Multiple Test Cases         | Done    |
| Short, Medium, Long Strings | Done    |
| Time & Space Analysis       | Done    |
| Clean Code + Comments       | Done    |
| GitHub-Ready Structure      | Done    |

---

## Project Structure
kmp-string-search/
│
├── src/
│   └── KMPAlgorithm.java          Main implementation
│
├── input/
│   ├── short.txt                  9 chars
│   ├── medium.txt                 73 chars
│   └── long.txt                   1009 chars
│
├── output/
│   ├── short_output.txt
│   ├── medium_output.txt
│   └── long_output.txt
│
├── REPORT.md                      1–2 page analysis
├── README.md                      This file
└── .gitignore

---

## How to Run

```bash
# Compile
javac src/KMPAlgorithm.java

# Run
java -cp src KMPAlgorithm
[0, 4]
[51]
Found: 101, first 5: [6, 16, 26, 36, 46]
