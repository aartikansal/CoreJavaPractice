
/*
Updatable interface in the Screen class
*/

public class Interface_updatable {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        public void onSelect(){
        }
        public void refresh(){

        }
    }
}
