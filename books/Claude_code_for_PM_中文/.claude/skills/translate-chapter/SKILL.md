---
name: translate-chapter
description: Translate a specific chapter of a PDF eBook from English to Chinese, output as Markdown.
arguments:
  - name: chapter
    description: The chapter number to translate (e.g., "5" or "3")
    required: true
  - name: source
    description: Path to the source PDF file (defaults to the most recent .pdf in the workspace)
    required: false
---

Translate chapter {{chapter}} of the eBook from English to Simplified Chinese (简体中文).

## Steps

1. **Extract** the text of chapter {{chapter}} from the PDF. If `pdftotext` is available, use it; otherwise read the PDF pages directly.
2. **Identify** the chapter's structure: its title, all section headings, subsections, lists, tables, code blocks, and any figures/diagrams referenced.
3. **Translate** the chapter's text to Simplified Chinese, following these rules:
   - **Preserve structure**: Keep all markdown headings (`#`, `##`, `###`), lists, blockquotes, tables, and horizontal rules intact. Translate the content within them.
   - **Code blocks**: Do NOT translate code blocks, commands, file paths, URLs, API names, or variable names. Leave them exactly as-is.
   - **Technical terms**: Translate consistently. If a term has no standard Chinese translation, keep the English original followed by a Chinese explanation in parentheses on first use in each chapter.
   - **Tone**: Professional, accurate, and readable. Prefer clarity over literal translation.
4. **Output** the translation to `chapter-{{chapter}}.md` in the workspace directory.
5. **Report** the chapter title, number of sections translated, and any terms added to the glossary.
