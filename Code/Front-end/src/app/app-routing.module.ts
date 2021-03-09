import {NgModule, Component} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import {LoginPageComponent} from './login-page/login-page.component';
import {AddUserComponent} from './add-user/add-user.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component';
import {AdminViewComponent} from './admin-view/admin-view.component';
import {ApprovalRejectionComponent} from './approval-rejection/approval-rejection.component';
import {FinalApprovalComponent} from './final-approval/final-approval.component';
import { UserListComponent } from './user-list/user-list.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { MessageComponent } from './message/message.component';
import { WeekdietComponent } from './weekdiet/weekdiet.component';
import { DailylogComponent } from './dailylog/dailylog.component';
import { MonthlymeasurementsComponent } from './monthlymeasurements/monthlymeasurements.component';
import { LogoutComponent } from './logout/logout.component';
import { ChallengerViewComponent } from './challenger-view/challenger-view.component';
import { ViewDailyLogsComponent } from './view-daily-logs/view-daily-logs.component';
import { ViewMonthlyMeasuresComponent } from './view-monthly-measures/view-monthly-measures.component';
import { MotivatorViewComponent } from './motivator-view/motivator-view.component';

const routes:Routes=[
    {path:'login',component:LoginPageComponent},
    {path:'register',component:AddUserComponent},
    {path:'admin-view',component:AdminViewComponent},
    {path:'approval-rejection',component:ApprovalRejectionComponent},
    {path:'final-approval/:userId',component:FinalApprovalComponent},
    {path:'users-list',component:UserListComponent},
    {path:'update-user/:userId',component:UpdateUserComponent},
    {path:'user-details/:userId',component:UserDetailsComponent},
    {path:'send-message',component:MessageComponent},
    {path:'week-diet-plan',component:WeekdietComponent},
    {path:'daily-log',component:DailylogComponent},
    {path:'monthly-measurement',component:MonthlymeasurementsComponent},
    {path:'logout',component:LogoutComponent},
    {path:'challenger-view',component:ChallengerViewComponent},
    {path:'view-daily-logs',component:ViewDailyLogsComponent},
    {path:'view-monthly-measures',component:ViewMonthlyMeasuresComponent},
    {path:'motivator-view',component:MotivatorViewComponent},
    {path:'',redirectTo:'login',pathMatch:'full'},
    {path:'**',component:PageNotFoundComponent}
];
@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{}
export const routingComponents=[LoginPageComponent,AddUserComponent,PageNotFoundComponent];