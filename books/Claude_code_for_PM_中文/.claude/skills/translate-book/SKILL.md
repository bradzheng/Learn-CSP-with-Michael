---
name: translate-book
description: Translate an entire PDF eBook from English to Chinese, chapter by chapter, with glossary management.
arguments:
  - name: source
    description: Path to the source PDF file (defaults to the most recent .pdf in the workspace)
    required: false
---

Translate the full eBook from English to Simplified Chinese (简体中文), processing it chapter by chapter.

## Phases

### Phase 1: Analyze
1. Extract or read the **table of contents** from the PDF to identify all chapters, their titles, and page ranges.
2. Create a file `TOC.md` listing all chapters with their page numbers and status (pending/in-progress/done).
3. Create a `glossary.md` file to track technical term translations throughout the book.

### Phase 2: Translate (chapter by chapter)
For each chapter, in order:
1. Invoke `translate-chapter` for that chapter number.
2. After translation completes, review for consistency with the glossary:
   - Add any new technical terms to `glossary.md`
   - Verify existing glossary terms are used consistently
3. Update `TOC.md` marking the chapter as done.

### Phase 3: Finalize
1. Review the full set of translated chapters for cross-chapter consistency.
2. Create `combined.md` merging all chapters in order with a table of contents.
3. Report: total chapters translated, word count, glossary terms defined.

## Translation Rules (apply throughout)
- Preserve all original structure: headings, lists, tables, code blocks.
- Code, commands, file paths, URLs, and API names remain untranslated.
- Use the glossary to ensure consistent term translation across chapters.
- When stuck on a term: add it to the glossary with a note, keep the English original in-text, and move on.
