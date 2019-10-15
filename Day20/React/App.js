import React from 'react';
import logo from './logo.svg';
import './App.css';
import Welcome from './component/Welcome';
import Message from './component/Message';
import Comment from './component/Comment';
import Like from './component/Like';
import Unlike from './component/Unlike';
function App() {
  return (
    <div className="App">
      <Welcome name="Ayesha" place="Banglore"></Welcome>
      <Welcome name="Saif" place="Chennai"></Welcome>
      <Welcome name="Kavya" place="Banglore"></Welcome>
      <Message></Message>
      <Comment commentsText="Cool"></Comment>
      <Like message="Awesome"></Like>
      <Unlike></Unlike>

    </div>
  );
}

export default App;
