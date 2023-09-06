package Test1604;

import java.util.*;

class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        //取出每个人的打卡时间
        HashMap<String,LinkedList<Integer>> hm = new HashMap<>();
        int length = keyName.length;
        for (int i = 0; i < length; i++) {
            String name = keyName[i];
            int time = ChangeTime(keyTime[i]);
            LinkedList<Integer> list;
            //确定name是否已在列表，来增加time
            if (hm.containsKey(name)) {
                list = hm.get(name);
            }else {
                list = new LinkedList<>();
            }
            list.add(time);
            hm.put(name,list);
        }
        List<String> listReturn = new LinkedList<>();//这个链表来返回结果，将警告的员工名字存放到里面
        Set<Map.Entry<String,LinkedList<Integer>>> set = hm.entrySet();
        for (Map.Entry<String,LinkedList<Integer>> entry : set) {
            //检验是否被警告
            Collections.sort(entry.getValue());
            LinkedList<Integer> list = entry.getValue();
            for (int i = 2; i < list.size(); i++) {
                if (list.get(i) - list.get(i - 2) <= 60) {
                    listReturn.add(entry.getKey());
                    break;
                }
            }
        }
        Collections.sort(listReturn);
        return listReturn;
    }
    //将时间字符串转变成分钟
    public int ChangeTime(String time) {
        return (time.charAt(0) - 47) * 600 + (time.charAt(1) - 47) * 60
                + (time.charAt(3) - 47) * 10 + (time.charAt(4) - 47);
    }
}