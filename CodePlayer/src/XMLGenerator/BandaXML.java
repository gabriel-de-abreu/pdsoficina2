/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLGenerator;

/**
 *
 * @author Gabriel
 */
 public  class BandaXML {
     /*
        Inicio da declaração de váriaveis
     */
        private final double ganho0;
        private final double ganho1;
        private final double ganho2;
        private final double ganho3;
        private final double ganho4;
        private final double ganho5;
        private final double ganho6;
        private final double ganho7;
        private final double ganho8;
        private final double ganho9;
        /*
            Fim da declaração de variaveis
        */

        public BandaXML(double ganho0, double ganho1, double ganho2, double ganho3, double ganho4, double ganho5, double ganho6, double ganho7, double ganho8, double ganho9) {
            this.ganho0 = ganho0;
            this.ganho1 = ganho1;
            this.ganho2 = ganho2;
            this.ganho3 = ganho3;
            this.ganho4 = ganho4;
            this.ganho5 = ganho5;
            this.ganho6 = ganho6;
            this.ganho7 = ganho7;
            this.ganho8 = ganho8;
            this.ganho9 = ganho9;
        }
        /*
            Inicio dos metodos getter e setter
        */
        public double getGanho0() {
            return ganho0;
        }

        public double getGanho1() {
            return ganho1;
        }

        public double getGanho2() {
            return ganho2;
        }

        public double getGanho3() {
            return ganho3;
        }

        public double getGanho4() {
            return ganho4;
        }

        public double getGanho5() {
            return ganho5;
        }

        public double getGanho6() {
            return ganho6;
        }

        public double getGanho7() {
            return ganho7;
        }

        public double getGanho8() {
            return ganho8;
        }

        public double getGanho9() {
            return ganho9;
        }      
        /*
            Fim dos getter e setter
        */
        
    }