package Testing

class Test {

    static void main(String[] args) {
        ArrayList<HashMap<String,String>> events = [["EVENTS":"HI","ID":"IDS"],["EVENTS":"HI","ID":"ID"]]

        println(events.get(0).getAt(events))

/*

        for(int i = 0; i<events.size();i++){
            HashMap map = events.get(i)
            for(int j=0;i<map.size();j++){
                print (map.get(j)+"::")
            }

        }
*/



    }
}
