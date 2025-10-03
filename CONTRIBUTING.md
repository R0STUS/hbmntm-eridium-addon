# Contributing Guidelines

## Commit Message Format

All commits in this project must follow the format:

```
<types>(<optional>) - <desc>
```

### Types

Use the following short tags for the type of changes:

* `Ft` — feature (new functionality)
* `Fx` — fix (bug fix)
* `Rf` — refactor (code improvement without logic change)
* `Ch` — chore (infrastructure, build system, gitignore, etc.)
* `Dc` — docs (documentation)
* `Ts` — test (tests)

### Examples

* `Ft(items) - add ModItems registry`
* `Fx(block) - fix block registration bug`
* `Rf(core) - cleanup item initialization`
* `Ch - update .gitignore`
* `Dc - add LICENSE and contributing guide`
* `Ts - add unit tests for item logic`

### Combining Types

It is allowed to combine multiple types in a single commit if the changes fall into different categories. For example:

```
FtChDc(block lazy) - added lazy block base and docs for this; gitignore change
```

Here:

* `Ft` → added a new block base
* `Ch` → updated `.gitignore`
* `Dc` → updated documentation

---

By following these rules, the commit history will stay clean, clear, and structured.
