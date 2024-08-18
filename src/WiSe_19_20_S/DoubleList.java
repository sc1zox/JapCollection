package WiSe_19_20_S;

public class DoubleList {

    private DoubleListElem start,end;

    public DoubleList(){
        this.start=null;
        this.end=null;
    }

    public void clear(){
        this.start=null;
        this.end=null;
    }
    public void insertAtEnd(int element){
        DoubleListElem neu = new DoubleListElem(element);

        if(start==null){
            this.start=neu;
            this.end=neu;
        }else{
            this.end.next=neu;
            neu.previous=end;
            this.end=neu;
        }
    }
}
