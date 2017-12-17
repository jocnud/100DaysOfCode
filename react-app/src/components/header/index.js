import React, {Component} from 'react'
import { Container, Grid, Header, Image, List, Menu } from 'semantic-ui-react'
import './index.css'
class AppHeader extends Component{

render (){
  return (
    <div className="AppHeader">
      <Container>

        <Grid divided inverted stackable className='headerStack'>
          <Grid.Row>
            <Grid.Column width={3}>
                <Image circular src='/assets/img/avatar.jpg' />
            </Grid.Column>
            <Grid.Column width={7}>
            <Grid.Row>
              <h2>Shahbaz Khan</h2>
            </Grid.Row>
            <Grid.Row>
              <h5>Secnior Software Engineer / Cerner Corporation</h5>
            </Grid.Row>
            </Grid.Column>
          </Grid.Row>
        </Grid>
      </Container>
    </div>


  )
}

}

export default AppHeader


/* <Header as='h2'>
  <Image circular src='/assets/img/avatar.jpg' />
    {' '}Shahbaz Khan
  </Header> */
