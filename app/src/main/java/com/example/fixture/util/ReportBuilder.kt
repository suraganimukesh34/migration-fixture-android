package com.example.fixture.util

class ReportBuilder {
    fun build(lines: List<String>): String = lines.joinToString("\n")
}
