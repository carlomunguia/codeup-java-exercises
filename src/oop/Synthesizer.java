//package oop;
//
//abstract class Synthesizer {
//    private String waveFormProcessor;
//    private String lfoGenerator;
//
//    public String controlPanel(String processor, String generator) {
//        this.waveFormProcessor = processor;
//        this.lfoGenerator = generator;
//    }
//
//    public String getWaveFormProcessor() {
//        return waveFormProcessor;
//    }
//
//    public String getLfoGenerator() {
//        return lfoGenerator;
//    }
//
//    public abstract String play();
//}
//
//class synthPlayer extends Synthesizer {
//    public String play() {
//        return "I'm processing the waves of sound from the Synthesizer!";
//    }
//}
//
//class cultLeader extends Synthesizer {
//    public String play() {
//        return "I am the cult leader and it is ME that plays this Synthesizer!!";
//    }
//}
