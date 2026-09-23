class SqueakyClean {
    static String clean(String identifier) {
        identifier = identifier.replace(" ", "_");

        boolean uppercaseNext = false;
        String result = "";
        for(int i = 0; i < identifier.length(); i++){
            char current = identifier.charAt(i);

            switch(current){
                case '4': 
                    current = 'a';
                    break;
                case '3':
                    current = 'e';
                    break;
                case '0':
                    current = 'o';
                    break;
                case '1':
                    current = 'l';
                    break;
                case '7':
                    current = 't';
                    break;
            }
            
            if(current == '-'){
                uppercaseNext = true;
            }
            else if(uppercaseNext){
                result += Character.toUpperCase(current);
                uppercaseNext = false;
            }
            else if(Character.isLetter(current) || current == '_'){
                result += current;
            }
        }
        return result;
    }
    
}