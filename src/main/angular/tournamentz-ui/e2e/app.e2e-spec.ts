import { TournamentzUiPage } from './app.po';

describe('tournamentz-ui App', () => {
  let page: TournamentzUiPage;

  beforeEach(() => {
    page = new TournamentzUiPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
