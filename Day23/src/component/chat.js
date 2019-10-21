import React from 'react';

const Chat = () => {
    function display()
    {
        console.log("Display called");
    }
    return (
        <div>
            <button onClick={display}>display</button>
        </div>
    );
};

export default Chat;