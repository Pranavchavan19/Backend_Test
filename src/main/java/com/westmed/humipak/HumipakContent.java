package com.westmed.humipak;

import java.util.List;

/** JSON shape returned by GET /api/humipak */
public record HumipakContent(
        String title,
        String tagline,
        List<String> intro,
        String robotNote,
        Testimonial testimonial,
        List<Highlight> highlights,
        BenefitGroup hospital,
        BenefitGroup cssd,
        List<String> features,
        String heroImage) {

    public record Testimonial(String quote, String name, String role) {}
    public record Highlight(String title, String text, String icon) {}
    public record BenefitGroup(String heading, List<String> items) {}
}
