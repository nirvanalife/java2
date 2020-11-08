import java.util.ArrayList;
import java.util.Collections;

public class test105 {
    /**
     * 给出一组区间，请合并所有重叠的区间。
     * 例如，
     * 给出[10,30],[20,60],[80,100],[150,180],
     * 返回[10,60],[80,100],[150,180].
     * 思路:先排序，之后比较，下一个的左边如果小于现在的右边，可以合并，合并后的右边是现在的右边与下一个右边的最大值
     */


      public static class Interval {
          int start;
          int end;
          Interval() { start = 0; end = 0; }
          Interval(int s, int e) { start = s; end = e; }
      }

    public static void main(String[] args) {
          ArrayList<Interval> intervals=new ArrayList<>();
          Interval interval1=new Interval(10,30);
          Interval interval2=new Interval(20,60);
          Interval interval3=new Interval(80,100);
          Interval interval4=new Interval(150,180);
          intervals.add(interval1);
          intervals.add(interval2);
          intervals.add(interval3);
          intervals.add(interval4);
          ArrayList<Interval> list=merge(intervals);

    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
          if(intervals.size()==0){
              return null;
          }
          Collections.sort(intervals,(a, b)->a.start-b.start);
          ArrayList<Interval> list=new ArrayList<>();
          int i=0;
          while(i<intervals.size()){
              int left=intervals.get(i).start;
              int right=intervals.get(i).end;
              while(i<intervals.size()-1&&right>=intervals.get(i+1).start){
                  right=Math.max(right,intervals.get(i+1).end);
                  i++;
              }
              list.add(new Interval(left,right));
              i++;
          }
        return list;
    }
}
