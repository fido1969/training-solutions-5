package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CapsulesBonusz {

        private List<String> capsules = new ArrayList<>();

        public void addLast(String colour) {
            capsules.add(colour);
        }

        public void addFirst(String colour){
            capsules.add(0, colour);
        }

        public void removeFirst() {
            capsules.remove(0);
        }

        public void removeLast() {
            capsules.remove(capsules.size()-1);
        }

        public List<String> getColors() {
            return capsules;
        }

        public static void main(String[] args) {

            arraylist.CapsulesBonusz c = new arraylist.CapsulesBonusz();
            c.addFirst("piros");
            c.addLast("kék");
            c.addFirst("zöld");
            c.addLast("rózsaszín");
            c.addFirst("lila");
            c.addLast("fekete");

         /* Vagyis a lista most elvileg igy néz ki:
         lila, zöld, piros, kék, rózsaszín, fekete
          */

            System.out.println(c.getColors());

            c.removeFirst();
            System.out.println(c.getColors());

            c.removeLast();
            System.out.println(c.getColors());

            List<String> torlendo = c.getColors();
            System.out.println(torlendo);

            torlendo.clear();
            System.out.println(torlendo);
            System.out.println(c.getColors());



        }

    }

