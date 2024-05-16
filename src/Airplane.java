class Airplane {
    // Composition: Airplane has an Engine, Wings, Passengers, and Crew
    private Engine engine;
    private Wing wing;
    private Passenger[] passengers;
    private Crew[] crew;

    // 생성자
    public Airplane() {
        this.engine = new Engine();
        this.wing = new Wing();
        this.passengers = new Passenger[150]; // 최대 150명까지 탑승 가능
        this.crew = new Crew[5]; // 승무원은 최대 5명
    }

    // 메서드
    public void startAirplane() {
        engine.start();
        wing.unfold();
        System.out.println("Airplane started");
    }

    public void stopAirplane() {
        engine.start();
        wing.fold();
        System.out.println("Airplane stopped");
    }

    public void addPassenger(Passenger passenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = passenger;
                System.out.println(passenger.getName() + " boarded the airplane");
                return;
            }
        }
        System.out.println("The airplane is full. Cannot add more passengers.");
    }

    public void addCrewMember(Crew crewMember) {
        for (int i = 0; i < crew.length; i++) {
            if (crew[i] == null) {
                crew[i] = crewMember;
                System.out.println(crewMember.getName() + " joined the crew");
                return;
            }
        }
        System.out.println("The crew is full. Cannot add more members.");
    }
}