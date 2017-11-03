package io.github.biaomingzhong.codingguidelines;

/**
 * Created by AmosZhong on 2017/11/2.
 */

public class CertainSuppressionWarningClass {

    public String getName(){
        String Name = "sadasd"; /** 该处有问题，但是因为不检查 LocalVariableName 的规则，所以checkstyle 没查到 */
        return Name;
    }
}
