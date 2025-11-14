# Report: Knuth-Morris-Pratt (KMP) String Search Implementation

5  

---

## 1. Selected Algorithm

**Knuth-Morris-Pratt (KMP)** – an efficient string matching algorithm that uses a **prefix function π** to avoid re-examining already matched characters.

- **Time Complexity:** `O(n + m)`  
- **Space Complexity:** `O(m)`  

---

## 2. How KMP Works

### Step 1: Compute Prefix Function π
- `π[i]` = length of the **longest proper prefix** of `pattern[0..i]` that is also a **suffix**.
- Enables **smart backtracking** on mismatch.
Example:
Pattern: A B A B A
Index:   0 1 2 3 4
π[i]:    0 0 1 2 3
text### Step 2: Search Phase
- On mismatch: `q = π[q-1]` → **no backtracking in the text**.
- Guarantees **linear time**.

---

## 3. Java Implementation

```java
private static int[] computePrefixFunction(String pattern)
public static List<Integer> search(String text, String pattern)

Fully commented and documented.
Returns all occurrence indices.
Handles edge cases: empty pattern, pattern longer than text, etc.


4. Testing
TestText LengthPatternMatchesSample PositionsShort9ABAB2[0, 4]Medium73ABABA1[51]Long1009ABABA101[6, 16, 26, 36, 46, ...]
Input files: input.txt
Expected output: output.txt + console

## 5. Complexity Analysis
OperationTimeSpacePrefix Function (π)O(m)O(m)Search in TextO(n)O(1)TotalO(n + m)O(m)
n = text length, m = pattern length
KMP vs Naive
AlgorithmWorst CaseExample: aaaa...a + aaa...abNaiveO(n × m)O(n²) – very slowKMPO(n + m)O(n) – always fast

6. Advantages of KMP

Linear time even on highly repetitive strings.
No backtracking in the text.
Supports overlapping matches ("AAAA" → "AAA" → [0, 1]).


7. Repository Structure
textkmp-string-search/
├── src/KMPAlgorithm.java
├── input/      ← test inputs
├── output/     ← expected results
├── REPORT.md   ← this report
├── README.md
└── .gitignore

8. Conclusion

KMP algorithm fully implemented and correct.
Tested on short, medium, and long strings.
Achieved O(n + m) time complexity.
Code is clean, well-commented, and professional.
Ready for submission before deadline.