import java.awt.geom.*;
import java.util.ArrayList;

public class Node{

    //The threshold limit value of bandwidth
    double BW_tlv;

    //The number of packet
    double cache; 

    //x y on the figure
    Point2D.Double pos;

    int parent_id;

    int child_num;

    ArrayList<Integer> child_id;

    double pre_depart_timestamp;

    double timestamp_to_join;
    
    //Timestamp to start participating
    double timestamp; 

    int layer;

    int color;

    Boolean is_begin_stream;

}
