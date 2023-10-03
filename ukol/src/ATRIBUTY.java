
    enum TypZvirete {
        OSEL,
        KRALIK,
        KUDLANKA,
        JINE
    }

    // Třída pro zvířata
    class Zvire {
        private String jmeno;
        private int vek;
        private TypZvirete typ;

        // Konstruktor
        public Zvire(String jmeno, int vek, TypZvirete typ) {
            this.jmeno = jmeno;
            this.vek = vek;
            this.typ = typ;
        }

        // Gettery pro atributy
        public String getJmeno() {
            return jmeno;
        }

        public int getVek() {
            return vek;
        }

        public TypZvirete getTyp() {
            return typ;
        }
    }


