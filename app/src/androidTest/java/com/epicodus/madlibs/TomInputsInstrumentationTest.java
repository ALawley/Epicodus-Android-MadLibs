package com.epicodus.madlibs;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagKey;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Guest on 4/19/16.
 */
public class TomInputsInstrumentationTest {

    @Rule
    public ActivityTestRule<TomInputs> activityTestRule =
            new ActivityTestRule<>(TomInputs.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.adjectiveText)).perform(typeText("Tall"))
                .check(matches(withText("Tall")));
    }

    @Test
    public void wordsAreSentToSubmitActivity() {
        String adjective = "tall";
        String verb = "typing";
        String noun = "apartment";
        String adverb = "furtively";
        String properNoun = "Arizona";
        onView(withId(R.id.adjectiveText)).perform(typeText(adjective));
        onView(withId(R.id.verbText)).perform(typeText(verb));
        onView(withId(R.id.nounText)).perform(typeText(noun));
        onView(withId(R.id.adverbText)).perform(typeText(adverb));
        onView(withId(R.id.properNounText)).perform(typeText(properNoun));

        onView(withId(R.id.submitWordsButton)).perform(click());
        onView(withId(R.id.storyTextView)).check(matches
                (withText("This is a story about " + adjective + " Tom's " + verb + " problem. " +
                        "One day, he went to town to buy a " + noun + " but found that he was " +
                        "so bad at " + verb + " he couldn't get there. After lots of practice "
                        + adverb + " " + verb + ", getting to the store " + adverb + " wasn't a " +
                        "problem at all, even when " + verb + " with Tom's super " + adjective +
                        " friend, " + properNoun + "!")));
    }
}
