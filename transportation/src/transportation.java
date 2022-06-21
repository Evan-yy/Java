public class transportation {
    public static void main(String[] args) {
       transprot bus = new bus(300,"Bus");
        transprot driving = new Driving(500,"Driving");
        transprot train = new train(400,"train");
        transprot plane = new plane(1000,"plane");

        transprot [] transprots = {driving,bus,train,plane};
        for(int i=0;i<transprots.length;i++){
            if(transprots[i].money<=500){
                System.out.println("XiaoMing can go by "+transprots[i].name);
            }
        }

    }
}
