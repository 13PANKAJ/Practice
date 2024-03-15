public class Sum {

    public static CharSequence sumInteger(String a , String b){
        StringBuilder sum = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        while(i>0&&j>0)
        {
            int digit =(i>=0)?a.charAt(i)-'0':0;
            int digit2 = (j>=0)?b.charAt(j)-'0':0;
            int sumOfInt=digit+digit2;//
            int i1 = sumOfInt / 10;
            sum.append(i1);
            i--;
            j--;
        }

        return sum;
    }

    public static void main(String[] args) {

        String a="222232244629420445529739893461909967206666939096499764990979600";
        String b="1";
        String add = (String) sumInteger(a,b);
    }
}
