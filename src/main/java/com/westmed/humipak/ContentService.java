package com.westmed.humipak;

import com.westmed.humipak.HumipakContent.*;
import java.util.List;
import org.springframework.stereotype.Service;

/** Holds page content. Swap for a repository/CMS later without touching the controller. */
@Service
public class ContentService {

    private static final String UP = "https://www.westmed.co.uk/wp-content/uploads/2020/10/";

    public HumipakContent getContent() {
        return new HumipakContent(
            "HUMIPAK",
            "Next generation technology",
            List.of(
                "HUMIPAK is a moisture retention pouch for post-operative instrument handling, designed to inhibit hydrophobic proteins adhering to surgical instruments by creating a moist environment. The idea originated from discussions with CSSD technicians experiencing difficulties cleaning post-operative instruments. The Westfield Medical team brought those challenges back to the brainstorm table and our engineers got to work. After several trials HUMIPAK was developed.",
                "HUMIPAK is one of the medical device industry's most innovative products developed in the last 10 years. It aims to reduce Health Care Associated Infections (HCAIs) by keeping instruments moist, so soil and dirt stay soft, making cleaning and decontamination easier and faster without pre-treatment chemicals.",
                "Humipak creates a containment for soiled and biohazardous instruments, facilitating safe transportation from the Operating Room (OR) to the Central Sterile Services Department (CSSD), improving Health & Safety of healthcare personnel."),
            "Humipak now offers 2 new sizes specifically designed for robotic arms, for a total of 4 sizes for robotic instruments.",
            new Testimonial(
                "We have been using Humipak Pouches for our flexible endoscopes since September 2018. After testing with 113 endoscopes we found the Humipak pouches highly effective and have been using it ever since. Humipak is very cost effective and employee friendly and saves us a lot of time. Would highly recommend Humipak to any hospital or facility.",
                "Mark Vijver", "CSD/CSSD Manager, Medisch Centrum Leeuwarden"),
            List.of(
                new Highlight("No chemicals", "Replace all gels and sprays", UP + "no-chemicals.jpg"),
                new Highlight("No pre-cleaning", "Saving time", UP + "no-pre-cleaning.jpg"),
                new Highlight("Containment of tray", "Improves health and safety", UP + "safety-for-all.jpg"),
                new Highlight("Compliance", "Complies with HTM01-01, 01-06 and NICE guidance", UP + "comply-with-htm.jpg"),
                new Highlight("Save time & money", "70% more productivity in washroom", UP + "save-time-and-money.jpg"),
                new Highlight("Better decontamination", "Improves patient safety", UP + "better-decontamination.jpg")),
            new BenefitGroup("The Hospital", List.of(
                "Reduces risk of infections – improved patient safety",
                "Helps reduce risk of cross-contamination and/or cancelled operations",
                "Improves operational efficiency in CSSD and OR without additional capital expenditure",
                "Validatable technology designed to facilitate compliance with HTM01-01 and HTM01-06 in keeping used instruments moist until reprocessed",
                "Keeps instruments contained overnight for hospitals running CSSD only on weekdays and/or daytime",
                "Less time needed to clean instruments before the Washer Disinfector",
                "Reduced Health and Safety concerns for everyone in the hospital")),
            new BenefitGroup("The CSSD", List.of(
                "Reduces pre-cleaning or makes it unnecessary",
                "Reduces workload",
                "Reduces possibility of missing instruments",
                "Reduces total processing time – frees up capacity",
                "Reduction of re-wash rates",
                "Highly effective for hard-to-clean instruments, such as cannulated instruments",
                "Reduces risk of damage for delicate instruments",
                "Potential reduction in rejected trays from OR",
                "Less foaming in Washer-Disinfector",
                "Reduced H&S concerns")),
            List.of(
                "Polyester/Polypropylene 12/38 micron films with a 40 gsm, highly hydrophilic, blue Viscose inner liner",
                "Closed with pressure sensitive, self-adhesive tape",
                "All medical grade materials",
                "Humipak logo, Instructions For Use, batch number, Westfield details and Biohazard symbol printed on the pouch",
                "Not intended for sterilisation – Humipak is not a Sterile Barrier System"),
            UP + "HUMIPAK-NEW-Page-banner-image-1-1024x576.png");
    }
}
