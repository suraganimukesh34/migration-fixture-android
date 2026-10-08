# migration-fixture-android

Synthetic Android fixture for validating the Java-to-Kotlin migration commit filter
(see the migration pattern extraction TDD, §8.4).

The history is intentionally built to exercise the filter:

- Baseline commit with plain Java files.
- Plain delete-plus-add conversions (`.java` removed, `.kt` added in the same area).
- A rename-only commit followed by a separate migrate commit (git rename detection edge case).

This is test data, not a real application.
