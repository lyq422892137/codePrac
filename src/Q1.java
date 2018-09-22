public class Q1 {
    public boolean Find(int target, int [][] array) {
//        题目描述
//        在一个二维数组中（每个一维数组的长度相同），
//        每一行都按照从左到右递增的顺序排序，
//        每一列都按照从上到下递增的顺序排序。
//        请完成一个函数，输入这样的一个二维数组和一个整数，
//        判断数组中是否含有该整数。

//        测试用例:
//        5,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
        boolean flag = false;
        if (array != null && array.length != 0 && (array.length != 1 && array[0].length != 0)) {
            for (int i = 0; i < array.length; i++) {
                if (target >= array[i][0]) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (target == array[i][j]) {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }
}
