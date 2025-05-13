package com.example.assignment;

/**
 * ✅ Official Solution: ReportFormatter Utility
 *
 * This class demonstrates how to clean, build, and safely append to strings using:
 * - String methods for cleaning and validation
 * - StringBuilder for efficient multi-part joining
 * - StringBuffer for thread-safe message building
 */
public class ReportFormatter {

    /**
     * Cleans the report title using basic String methods.
     *
     * - Trims leading and trailing whitespace
     * - Replaces internal spaces with dashes
     * - Converts all characters to lowercase
     *
     * @param rawTitle the original title string
     * @return a clean, formatted title
     */
    public static String cleanTitle(String rawTitle) {
        return rawTitle.trim().replace(" ", "-").toLowerCase();
    }

    /**
     * Joins an array of paragraph strings into one formatted body using StringBuilder.
     *
     * - Inserts two newlines between each paragraph
     * - Skips additional newline after the last paragraph
     *
     * @param paragraphs array of paragraphs to join
     * @return a single report body string
     */
    public static String formatBody(String[] paragraphs) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < paragraphs.length; i++) {
            builder.append(paragraphs[i]);

            // Add spacing only if it's not the last paragraph
            if (i < paragraphs.length - 1) {
                builder.append("\n\n");
            }
        }

        return builder.toString();
    }

    /**
     * Appends a footer to an existing report body using StringBuffer for thread safety.
     *
     * - Ensures formatting with a newline before the footer
     *
     * @param reportBody the original report content
     * @param footer     the footer or note to append
     * @return report with appended footer
     */
    public static String appendFooterThreadSafe(String reportBody, String footer) {
        StringBuffer buffer = new StringBuffer(reportBody);
        buffer.append("\n").append(footer);
        return buffer.toString();
    }
}
