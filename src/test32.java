public class test32 {
//    请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
//    例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
//    但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。

    public static void main(String []arg){
//        char []str=new char[]{'5','e','2'};

        String s="-.123";
        char []str=s.toCharArray();
        System.out.println(isNumeric(str));
    }
    public static boolean isNumeric(char[] str) {
        int length=str.length;
        if(length==0){
            return false;
        }
        //第一位情况
        if(str[0]=='+'||str[0]=='-'){
            if(!((str[1]>=48&&str[1]<=57)||(str[1]=='.'))){
                return false;
            }else{
                int i=2;
                while((i<length)&&(str[i]>=48&&str[i]<=57)){
                    i=i+1;
                }
                if(i==length){
                    return true;
                }else{
                    if(str[i]=='.'){
                        if(i+1<length){
                            i=i+1;
                            if(!(str[i]>=48&&str[i]<=57)){
                                return false;
                            }else{
                                int t=i;
                                while((t<length)&&(str[t]>=48&&str[t]<=57)){
                                    t=t+1;
                                }
                                if(t==length){
                                    return true;
                                }else if(str[t]=='e'||str[t]=='E'){
                                    if(t+1<length){
                                        i=t+1;
                                        if(!((str[i]=='-')||(str[i]=='+'))){
                                            if(str[i]>=48&&str[i]<=57){
                                                i=i+1;
                                                while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                                    i=i+1;
                                                }
                                                if(i==length){
                                                    return true;
                                                }else{
                                                    return false;
                                                }
                                            }else{
                                                return false;
                                            }

                                        }else{
                                            if(i+1<length){
                                                i=i+1;
                                                if(str[i]>=48&&str[i]<=57){
                                                    i=i+1;
                                                    while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                                        i=i+1;
                                                    }
                                                    if(i==length){
                                                        return true;
                                                    }else{
                                                        return false;
                                                    }
                                                }else{
                                                    return false;
                                                }
                                            }else{
                                                return false;
                                            }
                                        }
                                    }else{
                                        return false;
                                    }
                                }else{
                                    return false;
                                }
                            }
                        }else{
                            return false;
                        }
                    }else if(str[i]=='E'||str[i]=='e'){
                        if(i+1<length){
                            i=i+1;
                            if(!((str[i]=='-')||(str[i]=='+'))){
                                if(str[i]>=48&&str[i]<=57){
                                    i=i+1;
                                    while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                        i=i+1;
                                    }
                                    if(i==length){
                                        return true;
                                    }else{
                                        return false;
                                    }
                                }else{
                                    return false;
                                }

                            }else{
                                if(i+1<length){
                                    i=i+1;
                                    if(str[i]>=48&&str[i]<=57){
                                        i=i+1;
                                        while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                            i=i+1;
                                        }
                                        if(i==length){
                                            return true;
                                        }else{
                                            return false;
                                        }
                                    }else{
                                        return false;
                                    }
                                }else{
                                    return false;
                                }
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }

        }else if (str[0]>=48&&str[0]<=57){
            int i=1;
            while((i<length)&&(str[i]>=48&&str[i]<=57)){
                i=i+1;
            }
            if(i==length){
                return true;
            }else{
                if(str[i]=='.'){
                    if(i+1<length){
                        i=i+1;
                        if(!(str[i]>=48&&str[i]<=57)){
                            return false;
                        }else{
                            int t=i;
                            while((t<length)&&(str[t]>=48&&str[t]<=57)){
                                t=t+1;
                            }
                            if(t==length){
                                return true;
                            }else if(str[t]=='e'||str[t]=='E'){
                                if(t+1<length){
                                    i=t+1;
                                    if(!((str[i]=='-')||(str[i]=='+'))){
                                        if(str[i]>=48&&str[i]<=57){
                                            i=i+1;
                                            while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                                i=i+1;
                                            }
                                            if(i==length){
                                                return true;
                                            }else{
                                                return false;
                                            }
                                        }else{
                                            return false;
                                        }

                                    }else{
                                        if(i+1<length){
                                            i=i+1;
                                            if(str[i]>=48&&str[i]<=57){
                                                i=i+1;
                                                while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                                    i=i+1;
                                                }
                                                if(i==length){
                                                    return true;
                                                }else{
                                                    return false;
                                                }
                                            }else{
                                                return false;
                                            }
                                        }else{
                                            return false;
                                        }
                                    }
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }
                    }else{
                        return false;
                    }
                }else if(str[i]=='E'||str[i]=='e'){
                    if(i+1<length){
                        i=i+1;
                        if(!((str[i]=='-')||(str[i]=='+'))){
                            if(str[i]>=48&&str[i]<=57){
                                i=i+1;
                                while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                    i=i+1;
                                }
                                if(i==length){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }

                        }else{
                            if(i+1<length){
                                i=i+1;
                                if(str[i]>=48&&str[i]<=57){
                                    i=i+1;
                                    while((i<length)&&(str[i]>=48&&str[i]<=57)){
                                        i=i+1;
                                    }
                                    if(i==length){
                                        return true;
                                    }else{
                                        return false;
                                    }
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }

        }else{
            return false;
        }

    }
}
