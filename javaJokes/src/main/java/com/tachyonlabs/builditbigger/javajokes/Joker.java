package com.tachyonlabs.builditbigger.javajokes;

import java.util.Random;

public class Joker {
    String[] jokes = {"A boolean and a float walk into the Mos Eisley Cantina. The bartender throws them out, saying, \"We don't serve your types here!\"",
            "An Intent walks into a bar. The bartender scowls and says, \"All right pal, I’ll serve you, but don’t start anything.\"",
            "Luke Skywalker has been having a terrible time trying to figure out GitHub to get the example projects for his Nanodegree set up on his computer. His mentor Obi-Wan says, \"Use the forks, Luke.\"",
            "The \"Also known as:\" label TextView from the Sandwich Club starter code walks into a bar. The bartender says, \"Sorry, but I can't serve you, because you don't have an ID.\"",
            "Why did the Sandwich Club app make the Avengers sad? It said, \"Error: 404, Shawarma Not Found.\"",
            "The bartender says, \"We don't serve AsyncTasks in here.\" An AsyncTask walks into a bar.",
            "A student walks into the Grow_with_Google_Nanodegrees Slack #night_owls bar after a three-day weekend, and says, \"I'll have my usual.\" The bartender says, \"Sorry, your workspace is over its storage limit. Please upgrade to a paid plan if you want us to be able to remember anything that happened more than a couple days ago.\"",
            "A student posts to the Grow_with_Google_Nanodegrees Slack #github channel, \"Can anyone help me understand how to use 'Git Bash'? Is it supposed to be like 'Hulk Smash!', or do you only do a little bit of bashing?\"",
            "onDestroy() walks into a bar. \"Hey, where did everybody go?\"",
            "Android: where ProgressBars go around in circles and Spinners don’t spin.",
            "Spiders are the only web developers who enjoy finding bugs."};

    Random rand = new Random();

    public String getJoke() {
        return jokes[rand.nextInt(jokes.length)];
    }
}
