import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserService } from './user.service';
import { AddUserComponent } from './add-user/add-user.component';
import { FormsModule } from '@angular/forms';
import { AdminViewComponent } from './admin-view/admin-view.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component'
import { AppRoutingModule,routingComponents} from './app-routing.module';
import {RouterModule} from '@angular/router';
import {MatRadioModule} from '@angular/material/radio';

import { ApprovalRejectionComponent } from './approval-rejection/approval-rejection.component';
import { FinalApprovalComponent } from './final-approval/final-approval.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { HeaderComponent } from './header/header.component';
import { MessageComponent } from './message/message.component';
import { WeekdietComponent } from './weekdiet/weekdiet.component';
import { FileUploadModule} from 'ng2-file-upload';
import { DailylogComponent } from './dailylog/dailylog.component';
import { MonthlymeasurementsComponent } from './monthlymeasurements/monthlymeasurements.component';
import { LogoutComponent } from './logout/logout.component';
import { from } from 'rxjs';
import { ChallengerViewComponent } from './challenger-view/challenger-view.component';
import { ChallengerHeaderComponent } from './challenger-header/challenger-header.component';
import { MotivatorHeaderComponent } from './motivator-header/motivator-header.component';
import { ViewDailyLogsComponent } from './view-daily-logs/view-daily-logs.component';
import { ViewMonthlyMeasuresComponent } from './view-monthly-measures/view-monthly-measures.component';
import { MotivatorViewComponent } from './motivator-view/motivator-view.component';
@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    AddUserComponent,
    AdminViewComponent,
    LoginPageComponent,
    PageNotFoundComponent,
    routingComponents,
    ApprovalRejectionComponent,
    FinalApprovalComponent,
    UpdateUserComponent,
    UserDetailsComponent,
    HeaderComponent,
    MessageComponent,
    WeekdietComponent,
    DailylogComponent,
    MonthlymeasurementsComponent,
    LogoutComponent,
    ChallengerViewComponent,
    ChallengerHeaderComponent,
    MotivatorHeaderComponent,
    ViewDailyLogsComponent,
    ViewMonthlyMeasuresComponent,
    MotivatorViewComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule,
    AppRoutingModule,
    FileUploadModule,
    MatRadioModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
