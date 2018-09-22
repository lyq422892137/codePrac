public class Q2 {
//    题目描述
//    请实现一个函数，将一个字符串中的每个空格替换成“%20”。
//    例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public String replaceSpace(StringBuffer str){
        String str1 = str.toString();
        if (str1.length()!=0&&str1!=null){
            String[] array = str1.split("");
            StringBuffer str2 = new StringBuffer();
            String blank = " ";
            for (int i=0;i<array.length;i++){
                if (array[i].equals(blank)){
                    array[i]="%20";
                }
                str2.append(array[i]);
            }
            str1=str2.toString();

        }
        return str1;
    }

}
