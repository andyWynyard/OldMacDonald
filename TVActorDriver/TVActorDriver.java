public class TVActorDriver {
  public static void main(String[] args) {
    TVActor a = new TVActor();
    a.name = "Richard Attenborough";
    a.role = "John Hammond";

    TVActor b = new TVActor();
    b.name = "Martin Sheen";
    b.role = "Jeb Bartlet";

    TVActor c = new TVActor();
    c.name = "Hugh Laurie";
    c.role = "Berty Wooster";

    System.out.println(a.name + " played " + a.role);
    System.out.println(b.name + " played " + b.role);
    System.out.println(c.name + " played " + c.role);
  }
}
