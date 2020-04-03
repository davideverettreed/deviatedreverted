public enum MassUnit {

    MILLIGRAMS {
        public long toMilligrams(long milligrams) {return milligrams;}
        public double toGrams(long milligrams) {return milligrams/1000.0;}
        public double toKilograms(long milligrams) {return milligrams/1000.0/1000.0;}
        public double toOunces(long milligrams) {return milligrams/MILLIGRAMSPERPOUND/16.0;}
        public double toPounds(long milligrams) {return milligrams/MILLIGRAMSPERPOUND*1.0;}
    },

    GRAMS {
        public long toMilligrams(double grams) {return Double.valueOf(grams*1000).longValue();}
        public double toGrams(double grams) {return grams;}
        public double toKilograms(double grams) {return grams/1000.0;}
        public double toOunces(double grams) {return grams/(MILLIGRAMSPERPOUND/1000/16.0);}
        public double toPounds(double grams) {return grams/(MILLIGRAMSPERPOUND/1000.0);}
    },

    KILOGRAMS {
        public long toMilligrams(double kilograms) {return Double.valueOf(kilograms*1000*1000).longValue();}
        public double toGrams(double kilograms) {return Double.valueOf(kilograms*1000).longValue();}
        public double toKilograms(double kilograms) {return kilograms;}
        public double toOunces(double kilograms) {return (kilograms*1000.0)/(MILLIGRAMSPERPOUND)/16.0;}
        public double toPounds(double kilograms) {return (kilograms*1000.0*1000.0)/(MILLIGRAMSPERPOUND);}
    },

    METRICTONS {

    },

    OUNCES {
        public long toMilligrams(double ounces) {return Double.valueOf(ounces * (MILLIGRAMSPERPOUND/16.0)).longValue();}
        public double toGrams(double ounces) {return ounces * (MILLIGRAMSPERPOUND/1000.0/16.0);}
        public double toKilograms(double ounces) {return ounces * (MILLIGRAMSPERPOUND/1000.0/1000.0/16.0);}
        public double toOunces(double ounces) {return ounces;}
        public double toPounds(double ounces) {return ounces/16.0;}
    },

    POUNDS {
        public long toMilligrams(double pounds) {return Double.valueOf(pounds * (MILLIGRAMSPERPOUND)).longValue();}
        public double toGrams(double pounds) {return pounds * (MILLIGRAMSPERPOUND / 1000.0);}
        public double toKilograms(double pounds) {return pounds * (MILLIGRAMSPERPOUND / 1000.0 / 1000.0);}
        public double toOunces(double pounds) {return pounds * 16.0;}
        public double toPounds(double pounds) {return pounds;}
    },

    TONS {

    },

    ELEPHANTS {

    },

    USSGERALDRFORDSAIRCRAFTCARRIERS {

    };


    private static final long MILLIGRAMSPERPOUND = 453592;

    public long toMilligrams(long d){
        throw new AbstractMethodError();
    }

    public long toMilligrams(double d){
        throw new AbstractMethodError();
    }

    public double toGrams(double d){
        throw new AbstractMethodError();
    }

    public double toKilograms(double d){
        throw new AbstractMethodError();
    }

    public double toMetricTons(double d){
        throw new AbstractMethodError();
    }

    public double toOunces(double d){
        throw new AbstractMethodError();
    }

    public double toPounds(double d){
        throw new AbstractMethodError();
    }

    public double toTons(double d){
        throw new AbstractMethodError();
    }

    public double toElephants(double d){
        throw new AbstractMethodError();
    }

    public double toAircraftCarriers(double d){
        throw new AbstractMethodError();
    }


}
