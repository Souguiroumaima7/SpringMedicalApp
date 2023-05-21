
import Header from '../src/Compoments/Header';
import './App.css';
import { Container } from "@material-ui/core";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Service from '../src/Compoments/Service' ;
import About from '../src/Compoments/About' ;
function App() {
  return (

    <div className="App">
      <Header /> 
        <Container>
          <Switch>
          <Route path="/" component={About} exact />
          <Route path="/" component={Service} exact />
            </Switch>
           </Container> 
    </div>
  );
}

export default App;
