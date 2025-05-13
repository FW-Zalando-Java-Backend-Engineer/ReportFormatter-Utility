# 📄 ReportFormatter Utility – Official Solution

## 🧩 Overview

In this assignment, we built a report formatting utility using:

- ✂️ Java String methods for title cleanup
- 🧱 `StringBuilder` for efficient report body formatting
- 🧱 `StringBuffer` for thread-safe appending of footers

---

## ✅ Implemented Methods

### 1. `cleanTitle(String rawTitle)`
📌 Uses only `String` methods  
✔ Trims, replaces spaces with dashes, and lowercases the title

**Example:**
```java
Input:  "  Monthly Report Summary "
Output: "monthly-report-summary"
```

---

### 2. `formatBody(String[] paragraphs)`
📌 Uses `StringBuilder`  
✔ Joins paragraphs with two newlines between

**Example:**
```java
Input:  ["First line.", "Second paragraph."]
Output:
"First line.\n\nSecond paragraph."
```

---

### 3. `appendFooterThreadSafe(String body, String footer)`
📌 Uses `StringBuffer`  
✔ Appends footer with newline in a thread-safe manner

**Example:**
```java
Body:   "End of report."
Footer: "--- Confidential ---"
Output:
"End of report.\n--- Confidential ---"
```

---

## 💻 Sample Usage

```java
String title = ReportFormatter.cleanTitle("  Quarterly Inventory Review  ");

String body = ReportFormatter.formatBody(new String[] {
    "Warehouse stock has improved.",
    "Surplus expected in next month."
});

String fullReport = ReportFormatter.appendFooterThreadSafe(body, "--- Reviewed by Ops ---");
```

---

## 📚 Concepts Practiced

| Concept                  | Where Applied                  |
|--------------------------|--------------------------------|
| `.trim()`, `.replace()`  | `cleanTitle()`                |
| `StringBuilder.append()` | `formatBody()`                |
| `StringBuffer.append()`  | `appendFooterThreadSafe()`    |

---

## 🔍 Next Step

Try writing unit tests for each method to verify formatting under edge cases, and simulate multiple threads to test `StringBuffer`.

You're now writing string logic like a backend engineer! 🚀
