package DATA_STRUCTURE.CollectionFramework.L_37_39_40_41_Lists.L_39_ArrayList_Merge_Interval;

public class MainClass {
}

/*
//Question solution just visualise ,{ interviewBit website question }

    if(interval==null){
        intervals=new ArrayList<Interval>();
        intervals.add(newInterval);
        return intervals;
    }else if(intervals.size()==0){
        intervals.add(newInterval);
        return intervals;
    }

    Interval toInsert=newInterval;

    int i=0;
    while(i<intervals.size()){
        Interval current=intervals.get(i);
        if(current.end < toInsert.start){
            i++;
            continue;
         }else if(toInsert.end < current.start){
            intervals.add(i , toInterval);
            break;
         }else{
              toInterval.start=Math.min(toInsert.start , current.start);
              toInterval.end=Math.max(toInsert.end , current.end);
              intervals.remove(i);
         }
    }

    if(i==intervals.size()){
        intervals.add(toInsert);
    }
    return intervals;

 */
