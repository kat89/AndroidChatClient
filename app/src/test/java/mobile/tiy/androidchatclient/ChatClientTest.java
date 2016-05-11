package mobile.tiy.androidchatclient;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kat on 5/11/2016.
 */
public class ChatClientTest {

    ChatClient chatClient;

    @Before
    public void setUp() throws Exception {

      chatClient = new ChatClient();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSendMessage() throws Exception {

        String message = "message to app";
        String actualResponse = chatClient.sendMessage(message);
        String expectedResponse = "echo:" + message;
        assertEquals(expectedResponse, actualResponse);


    }
}