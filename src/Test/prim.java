package Test;
import java.util.*;
public class prim {


    static int m = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] map = new int[][] {
                {0, 2, 2, 1, m, m, m},
                {2, 0, m, 5, 1, m, m},
                {2, m, 0, 1, m, 2, m},
                {1, 5, 1, 0, 1, 6, 5},
                {m, 1, m, 1, 0, 8, 3},
                {m, m, 2, 6, m, 0, 10},
                {m, m, m, m, m, 10, 0}};
        prim(map, map.length);
    }
    public static void prim(int[][] graph, int n){

        char[] c = new char[]{'A','B','C','D','E','F','G','E','F'};
        int[] lowcost = new int[n];  //到新集合的最小权
        int[] mid= new int[n];//存取前驱结点
        List<Character> list=new ArrayList<Character>();//用来存储加入结点的顺序
        int i, j, min, minid , sum = 0;
        //初始化辅助数组
        for(i=1;i<n;i++)
        {
            lowcost[i]=graph[0][i];
            mid[i]=0;
        }
        list.add(c[0]);
        //一共需要加入n-1个点
        for(i=1;i<n;i++)
        {
            min=m;
            minid=0;
            //每次找到距离集合最近的点
            for(j=1;j<n;j++)
            {
                if(lowcost[j]!=0&&lowcost[j]<min)
                {
                    min=lowcost[j];
                    minid=j;
                }
            }

            if(minid==0) return;
            list.add(c[minid]);
            lowcost[minid]=0;
            sum+=min;
            System.out.println(c[mid[minid]] + "到" + c[minid] + " 权值：" + min);
            //加入该点后，更新其它点到集合的距离
            for(j=1;j<n;j++)
            {
                if(lowcost[j]!=0&&lowcost[j]>graph[minid][j])
                {
                    lowcost[j]=graph[minid][j];
                    mid[j]=minid;
                }
            }
        }
        System.out.println("sum:" + sum);

    }

}
