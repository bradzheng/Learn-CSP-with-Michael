# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Purpose

This workspace is for translating eBooks using Claude. PDF files are placed here for translation from one language to another (e.g., English → Chinese, Chinese → English).

## Workflow

1. PDF files are the input. They are placed in this directory.
2. Translation is done by extracting text from the PDFs and having Claude translate the content chapter by chapter.
3. Translated output should be saved as Markdown (`.md`) files in this directory, preserving the original book's structure (chapters, sections, headings).

## Translation Guidelines

- Preserve the original structure: chapter titles, section headings, lists, code blocks, tables, etc.
- Technical terms should be translated consistently throughout a book. When encountering a domain-specific term, note the chosen translation and reuse it.
- For technical books: keep code blocks, commands, file paths, and API names in their original language (untranslated). Translate only the surrounding explanatory text.
- When a term has no standard translation in the target language, keep the original and add a parenthetical explanation.
