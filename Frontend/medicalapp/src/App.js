
import Header from './Compoments/Header';
import './App.css';
import { Container } from "@material-ui/core";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import Service from './Compoments/Service' ;
import About from './Compoments/About' ;
import Feature from './Compoments/Feature' ;
import Team from './Compoments/Team' ;
import Testimonial from './Compoments/Testimonial' ;
import NavBar from './Compoments/NabBar' ;
import Appointement from './Compoments/Appointement' ;

function App() {
  return (
    <Router>
    <div className="App">
      <Header /> 
        <Container>
          <Switch>
          <Route path="/" component={NavBar} exact />
          <Route path="/" component={About} exact />
          <Route path ="/" component ={Appointement} exact />
          <Route path="/" component={Service} exact />
          <Route path = "/" component={Feature} exact />
          <Route path = "/" component={Team} exact />
          <Route path = "/" component={Testimonial} exact />
            </Switch>
           </Container> 
    </div>
    </Router>
  );
}

export default App;
