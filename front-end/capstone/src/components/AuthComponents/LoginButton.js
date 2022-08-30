import React from 'react';
import { useAuth0 } from '@auth0/auth0-react';
import styled from "styled-components"

const LoginButton = () => {
    const { loginWithRedirect } = useAuth0();

    return(

      <FAUser
      className=""
      onClick={() => loginWithRedirect()}
    />
    )

};

const FAUser = styled.button`
background: transparent;
border: none;
color: white ;
padding-inline:1rem;
`

export default LoginButton;