public enum enum_with_vals {
    CAPTAIN_CRUNCH(20),
    FROOT_LOOPS(40),
    REESES_PUFFS(10),
    COCOA_PUFFS(33);

    final int cereal_score;
    enum_with_vals (int cereal_score){
        this.cereal_score=cereal_score;
    }

}
