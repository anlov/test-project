package com.anlov.Lesson_4;

public class Park {
    private String parkName = "DisneyLand";
    public class Attractions {
        private String infoAttractions;
        private String timeWork;
        private double costAttractions;
        public Attractions(String infoAttractions,String timeWork,double costAttractions) {
            this.infoAttractions = infoAttractions;
            this.timeWork = timeWork;
            this.costAttractions = costAttractions;

        }
    }
}
