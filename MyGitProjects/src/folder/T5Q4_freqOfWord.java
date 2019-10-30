
package folder;

public class T5Q4_freqOfWord {

    public static void main(String[] args) {
        // TODO code application logic here
        String sentence[]={"the","name","of","the","person","is","Richard"};
        String identify="the";
        int freq=0;
        
        for(int i=0;i<sentence.length;i++){
            if(identify.equals(sentence[i])){
                freq+=1;
            }
        }
        System.out.println(freq);
        
    }
    
}
