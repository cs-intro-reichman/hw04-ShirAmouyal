public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
     
    }

    public static String capVowelsLowRest (String string) {
        // Write your code here:
        String str="";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='a'){
                str+='A';   
            }
            else if(string.charAt(i)=='e'){
              str+='E';
            }
            else if(string.charAt(i)=='i'){
             str+="I";
            }
            else if(string.charAt(i)=='o'){
             str+="O";
            }
            else if(string.charAt(i)=='u' ){
             str+="U";
            }

            else if(string.charAt(i)==32){
                str+=" ";
            }
            else if(string.charAt(i)>64 && string.charAt(i)<91){
                str+=(char) (string.charAt(i)+32) ;
            }
            else{
                str+=(char) string.charAt(i);
            }
        }
        return str;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String str="";
        //אות גדולה בתו הראשון
        if(string.charAt(0)>='A'&& string.charAt(0)<='Z'){
            str+=(char)(string.charAt(0)+32) ;
        }
        // אות קטנה בתו הראשון
        else if(string.charAt(0)>='a'&& string.charAt(0)<='z'){
            str+=(char)string.charAt(0);
        }
        // האם יש רווח לפני המשפט
        int n=1;
         while(string.charAt(n)==32){
         n++;}
        
         // האם אחרי הרווח יש אות גדולה
        if(string.charAt(n)>='A'&& string.charAt(n)<='Z'){
            str+=(char)(string.charAt(n)+32);
            n++;
        }
        // האם אחרי הרווח האות קטנה
        else if(string.charAt(n)>='a'&& string.charAt(n)<='z'){
            str+=(char)string.charAt(n);
            n++;
        }
        // כעת נרוץ על שאר המחרוזת בלי המילה הראשונה
        for(int i=n;i<string.length();i++){
            // האם המילה לא ראשונה והיא אות קטנה?
            if(string.charAt(i-1)==32 && string.charAt(i)>='a'&& string.charAt(i)<='z'){
                str+=(char)(string.charAt(i)-32);
            }
            // האם המילה היא לא ראשונה והיא אות גדולה?
            else if(string.charAt(i-1)==32&&string.charAt(i)>='A'&& string.charAt(i)<='Z'){
                str+=(char)(string.charAt(i));
            }
            // האם אתה לא האות הראשונה במילה ואתה אות גדולה
            else if(string.charAt(i-1)!=32 && string.charAt(i)>='A'&& string.charAt(i)<='Z'){
                str+=(char)(string.charAt(i)+32);
            }
            // האם אתה לא האות הראשונה במשפט ואתה אות קטנה
            else if(string.charAt(i-1)!=32 && string.charAt(i)>='a'&& string.charAt(i)<='z'){
                str+=(char)(string.charAt(i));
            }
        } 
      return str; 
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int length=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==chr){
            length++;
            }
        }
        int[] arr1=new int[length];
        int x=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==chr){
             arr1[x]=i;
             x++;
            }  
        }
        return arr1;
    }
}
